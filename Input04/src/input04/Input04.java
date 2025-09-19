package input04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input04 {
    public static void main(String[] args) {
        String filePath = "src/input04/input04text.txt";
        String stopWord = "BlueBumper";
        int x = 0, y = 0;
        boolean foundStopWord = false;

        try (Scanner scanner = new Scanner(new File(filePath))) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                if (!foundStopWord) {
                    System.out.println("До стоп-слова: " + line);
                    
                    if (line.contains(stopWord)) {
                        foundStopWord = true;
                        // Разбиваем строку на части
                        String[] parts = line.split(" ");
                        boolean afterStopWord = false;
                        
                        for (String part : parts) {
                            if (afterStopWord) {
                                // Ищем числа только после стоп-слова
                                if (isInteger(part)) {
                                    if (x == 0) {
                                        x = Integer.parseInt(part);
                                    } else if (y == 0) {
                                        y = Integer.parseInt(part);
                                        break; // Оба числа найдены
                                    }
                                }
                            }
                            if (part.equals(stopWord)) {
                                afterStopWord = true;
                            }
                        }
                    }
                } else {
                    // Если числа не найдены в строке со стоп-словом
                    if (x == 0 || y == 0) {
                        String[] parts = line.split(" ");
                        for (String part : parts) {
                            if (isInteger(part)) {
                                if (x == 0) {
                                    x = Integer.parseInt(part);
                                } else if (y == 0) {
                                    y = Integer.parseInt(part);
                                    break;
                                }
                            }
                        }
                    }
                    if (x != 0 && y != 0) break;
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("X: " + x + ", Y: " + y);
    }
    
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}