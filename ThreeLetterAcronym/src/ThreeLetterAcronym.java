import javax.swing.JOptionPane;
public class ThreeLetterAcronym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char SPACE = ' ' ;
		char[] letters = new char[3];
		StringBuilder wordInput = new StringBuilder(" ");
		int count=0;
		
		
		wordInput.append(JOptionPane.showInputDialog(null, "Enter a three word string."));
		
		for (int x = 0; x < wordInput.length(); ++x){
			if (wordInput.charAt(x) == SPACE && wordInput.charAt(x + 1) != SPACE){
				if (count !=3){
					++x;
					letters[count] = wordInput.charAt(x);
					letters[count] = Character.toUpperCase(letters[count]);
					++count;
				}else{
					wordInput.setLength(x);
				}
			}
		
		}
		JOptionPane.showMessageDialog(null, "Your string was" + wordInput + ".\n Your acronym is: " + letters[0] + letters[1] + letters[2]);
	}

}
