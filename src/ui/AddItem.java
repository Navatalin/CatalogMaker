package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddItem extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nameTextField;
	private JTextField descriptionField;
	private JTextField authorField;
	private JTextField genreField;
	private Boolean cancelled;

	/**
	 * Create the dialog.
	 */
	public AddItem() {
		cancelled = false;
		setBounds(100, 100, 306, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			nameTextField = new JTextField();
			nameTextField.setBounds(125, 29, 134, 28);
			contentPanel.add(nameTextField);
			nameTextField.setColumns(10);
		}
		{
			JLabel lblName = new JLabel("Name");
			lblName.setBounds(36, 35, 61, 16);
			contentPanel.add(lblName);
		}
		{
			JLabel lblDescription = new JLabel("Description");
			lblDescription.setBounds(36, 63, 73, 16);
			contentPanel.add(lblDescription);
		}
		{
			JLabel lblAuthor = new JLabel("Author");
			lblAuthor.setBounds(36, 92, 61, 16);
			contentPanel.add(lblAuthor);
		}
		{
			JLabel lblGenre = new JLabel("Genre");
			lblGenre.setBounds(36, 120, 61, 16);
			contentPanel.add(lblGenre);
		}
		{
			JLabel lblCategory = new JLabel("Category");
			lblCategory.setBounds(36, 147, 61, 16);
			contentPanel.add(lblCategory);
		}
		{
			descriptionField = new JTextField();
			descriptionField.setBounds(125, 57, 134, 28);
			contentPanel.add(descriptionField);
			descriptionField.setColumns(10);
		}
		{
			authorField = new JTextField();
			authorField.setBounds(125, 86, 134, 28);
			contentPanel.add(authorField);
			authorField.setColumns(10);
		}
		{
			genreField = new JTextField();
			genreField.setBounds(125, 114, 134, 28);
			contentPanel.add(genreField);
			genreField.setColumns(10);
		}
		{
			JComboBox categoryComboBox = new JComboBox();
			categoryComboBox.setEditable(true);
			categoryComboBox.setBounds(125, 143, 134, 27);
			contentPanel.add(categoryComboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Add");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						//Add Items
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						//Cancel Menu
						cancelled = true;
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public Boolean IsCancelled() {
		return cancelled;
	}

}
