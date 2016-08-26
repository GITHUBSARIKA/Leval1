
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class photoquizx4 {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		String trump = "http://www.slate.com/content/dam/Slatest/Trump_taco.png.CROP.promo-xlarge2.png";
		// 2. create a variable of type "Component" that will hold your image
		Component bob;
		// 3. use the "createImage()" method below to initialize your Component
		bob = createImage(trump);
		// 4. add the image to the quiz window
		quizWindow.add(bob);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String guess = JOptionPane.showInputDialog("What is this a picture of?");
		// 7. print "CORRECT" if the user gave the right answer
		if (guess.equals("Donald Trump eating a taco")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(bob);
		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window
		String map = "https://lh3.googleusercontent.com/MOf9Kxxkj7GvyZlTZOnUzuYv0JAweEhlxJX6gslQvbvlhLK5_bSTK6duxY2xfbBsj43H=w300";
		Component dob;
		dob = createImage(map);
		// 12. pack the quiz window
		quizWindow.add(dob);
		quizWindow.pack();
		// 13. ask another question
		String google = JOptionPane.showInputDialog("What is this picture ?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (google.equals("google maps")) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
