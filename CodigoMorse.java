package modelo;
import teste.TestarCodigoMorse;

public class CodigoMorse {
	
	public String convertToMorse(String text) {
		
		//tratamento de exceção 
		if(text==null || text.trim().isEmpty()) {
			throw new IllegalArgumentException("Texto Vazio.");
		
		}
		
		StringBuilder morseCode = new StringBuilder();
		for (char c : text.toUpperCase().toCharArray()) {
            String morseChar = "";
           
            switch (c) {
               
                case 'A': morseChar = ".-"; break;
                case 'B': morseChar = "-..."; break;
                case 'C': morseChar = "-.-."; break;
                case 'D': morseChar = "-.."; break;
                case 'E': morseChar = "."; break;
                case 'F': morseChar = "..-."; break;
                case 'G': morseChar = "--."; break;
                case 'H': morseChar = "...."; break;
                case 'I': morseChar = ".."; break;
                case 'J': morseChar = ".---"; break;
                case 'K': morseChar = "-.-"; break;
                case 'L': morseChar = ".-.."; break;
                case 'M': morseChar = "--"; break;
                case 'N': morseChar = "-."; break;
                case 'O': morseChar = "---"; break;
                case 'P': morseChar = ".--."; break;
                case 'Q': morseChar = "--.-"; break;
                case 'R': morseChar = ".-."; break;
                case 'S': morseChar = "..."; break;
                case 'T': morseChar = "-"; break;
                case 'U': morseChar = "..-"; break;
                case 'V': morseChar = "...-"; break;
                case 'W': morseChar = ".--"; break;
                case 'X': morseChar = "-..-"; break;
                case 'Y': morseChar = "-.--"; break;
                case 'Z': morseChar = "--.."; break;
                case ' ': morseChar = "/"; break; // Representa um espaço
               
            }
            if (!morseChar.isEmpty()) {
                morseCode.append(morseChar).append(" "); // Espaços entre os codigos
            }
        }
		
        
        return morseCode.toString().trim(); //Remove o espaço extra no final
    }
		
      }
