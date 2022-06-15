import java.util.Scanner;

public class theReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("111. Rose Quartz ");
        System.out.println("222. Clear Quartz ");
        System.out.println("444. Amethyst ");
        
        System.out.println();
        System.out.println("Choose a crystal and enter the number associated with the crystal: "); 
        int crystal = input.nextInt(); 
		
        tarotCards tarot = new tarotCards();
        angelicNumbers angel = new angelicNumbers();
        
        while (crystal != 111 && crystal != 222 && crystal != 444) {
        	
        	System.out.println("Not a valid entry! Try again. ");
        	System.out.println("Choose a crystal and enter the number associated with the crystal: "); 
            crystal = input.nextInt(); 
        	
        }
        
        if (crystal == 111) {
        	

            System.out.println();
        	tarot.setNameOfCard("High Priestess");
        	tarot.setKey(2);
        	tarot.setMeaning("Trust your intuition and inner knowing.");
        	tarot.setMeaningReversed("Learn to believe in yourself more, so you believe in your intuition more. If you feel something is right for you, it is right for you.");
        	angel.setAngelNumbers(111);
        	angel.setAngelMeaning("The angels are telling you that you are manifesting new and great things into your life. You are manifesting love, abundance, and everything you want slowly into your life. ");
        
        }
        

        
        else if (crystal == 222) {

            System.out.println();
        	tarot.setNameOfCard("The Empress");
        	tarot.setKey(3);
        	tarot.setMeaning("Take the opportunities you want to take and focus on yourself. ");
        	tarot.setMeaningReversed("You might be lacking in believing that you are capable of taking the opportunities or find yourself doubting yourself. Trust that you are good enough. ");
        	angel.setAngelNumbers(222);
        	angel.setAngelMeaning("The angels are telling you to build the life you really want. Go for the extra mile. ");
        	
        }
        
        else if (crystal == 444) {

            System.out.println();
        	tarot.setNameOfCard("Death");
        	tarot.setKey(13);
        	tarot.setMeaning("This is not a scary card. It means one part of your life is ending and a new chapter is approaching. You are ready to start fresh. ");
        	tarot.setMeaningReversed("You might be feeling lost or a huge event caused your life to make you feel like this is the end of it. This is a reminder that you are capable of starting a better life. ");
        	angel.setAngelNumbers(444);
        	angel.setAngelMeaning("This is a sign that the angels are watching over you and you should keep high hopes. Things will get better. ");
        	
        }
        
        System.out.println(tarot.toString()); 
        tarot.Aphrodite();
        tarot.Angel();
        
        System.out.println();
        
        System.out.println(angel.toString());
        angel.Angel();
        
        System.out.println();
        
        System.out.println("Thank you for visiting Aphrodite's Palace. Come back again soon! ");
        
        
		

	}

}
