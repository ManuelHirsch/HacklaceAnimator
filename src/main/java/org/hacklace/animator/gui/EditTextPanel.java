package org.hacklace.animator.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

import org.hacklace.animator.IniConf;
import org.hacklace.animator.displaybuffer.DisplayBuffer;
import org.hacklace.animator.displaybuffer.FontUtil;
import org.hacklace.animator.displaybuffer.TextDisplayBuffer;

public class EditTextPanel extends EditPanel {

	private static final long serialVersionUID = 8568315594127340767L;

	private LedPanel textLedPanel; // display for text
	private JTextField textEditField;
	private JPanel textPanel;
	private JPanel virtualKeyboardPanel;

	public EditTextPanel(DisplayBuffer displayBuffer) {
		super(displayBuffer);
		textEditField.setText(((TextDisplayBuffer)bufferRef).getText());
		rawInputTextField.setText(bufferRef.getRawString());
	}

	@Override
	protected void addMoreComponents(JPanel panel) {
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = GridBagConstraints.RELATIVE;
		textLedPanel = new LedPanel(IniConf.getInstance().rows(), IniConf.getInstance().columns() * 5);
		panel.add(textLedPanel, c);
		c.insets = new Insets(5, 5, 5, 5);
		JSlider positionSlider = createPositionSlider();
		panel.add(positionSlider, c);
		c.insets = new Insets(0, 0, 0, 0);
		virtualKeyboardPanel = createVirtualKeyboardPanel();
		panel.add(virtualKeyboardPanel, c);
		textPanel = createTextPanel();
		panel.add(textPanel, c);
	}

	private JPanel createVirtualKeyboardPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1));
		panel.add(new JLabel("Virtual Keyboard:"));
		ActionListener virtualKeyboardListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				VirtualKeyboardButton vk = (VirtualKeyboardButton) arg0
						.getSource();
				String chars = vk.getString();
				int pos = textEditField.getCaretPosition();
				try {
					textEditField.getDocument().insertString(pos, chars, null);
					((TextDisplayBuffer) bufferRef).setText(textEditField
							.getText());
					setFromDisplayBuffer(bufferRef);
				} catch (BadLocationException e) {
					// just do nothing, this should not happen anyways
				}
			}
		};
		final int VIRTUAL_KEYS_PER_ROW = 15;
		int columsRemaining = VIRTUAL_KEYS_PER_ROW;

		JPanel keyboardRow = new JPanel();
		panel.add(keyboardRow);

		VirtualKeyboardButton button = new VirtualKeyboardButton(0x7F);
		button.setToolTipText("one empty column");
		button.addActionListener(virtualKeyboardListener);
		keyboardRow.add(button);
		columsRemaining--;

		button = new VirtualKeyboardButton('^');
		button.addActionListener(virtualKeyboardListener);
		keyboardRow.add(button);
		columsRemaining--;

		button = new VirtualKeyboardButton('$');
		button.addActionListener(virtualKeyboardListener);
		keyboardRow.add(button);
		columsRemaining--;

		button = new VirtualKeyboardButton('~');
		button.addActionListener(virtualKeyboardListener);
		keyboardRow.add(button);
		columsRemaining--;

		for (int i = FontUtil.LOWEST_SPECIAL_INDEX; i <= FontUtil.HIGHEST_INDEX; i++) {
			if (columsRemaining == 0) {
				keyboardRow = new JPanel();
				panel.add(keyboardRow);
				columsRemaining = VIRTUAL_KEYS_PER_ROW;
			}
			columsRemaining--;

			button = new VirtualKeyboardButton(i);
			if (i - FontUtil.SPECIAL_CHAR_OFFSET == '^')
				button.setToolTipText("six empty columns");
			button.addActionListener(virtualKeyboardListener);
			keyboardRow.add(button);
		}
		return panel;
	}

	private JPanel createTextPanel() {
		textPanel = new JPanel();
		textEditField = new JTextField(DisplayBuffer.getNumGrids());
		PlainDocument doc = new PlainDocument();
		doc.setDocumentFilter(new DocumentFilter() {
			public void insertString(FilterBypass fb, int offs, String str,
					AttributeSet a) throws BadLocationException {
				if ((fb.getDocument().getLength() + str.length()) <= DisplayBuffer
						.getNumGrids())
					super.insertString(fb, offs, str, a);
				else
					Toolkit.getDefaultToolkit().beep();
			}

			public void replace(FilterBypass fb, int offs, int length,
					String str, AttributeSet a) throws BadLocationException {
				if ((fb.getDocument().getLength() + str.length() - length) <= DisplayBuffer
						.getNumGrids())
					super.replace(fb, offs, length, str, a);
				else
					Toolkit.getDefaultToolkit().beep();
			}
		});
		textEditField.setDocument(doc);
		textEditField.addKeyListener(new KeyListener() {
			private void updateText() {
				((TextDisplayBuffer) bufferRef).setText(textEditField.getText());
				setFromDisplayBuffer(bufferRef);
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				updateText();
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				updateText();
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				updateText();
			}
		});
		textPanel.add(textEditField);
		return textPanel;
	}

	@Override
	public void setFromDisplayBuffer(DisplayBuffer buffer)	{
		super.setFromDisplayBuffer(buffer);
		copyBufferToPanel(currentPosition, textLedPanel);
	}
}
