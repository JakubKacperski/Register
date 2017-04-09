package com.register.main;

import com.register.file.CreateFile;
import com.register.file.DeleteFile;
import com.register.file.RenameFile;
import com.register.file.WriteToFile;

class Menu {

    public static void menu() {
        while ( true ){
            Print.print(
                    "---------------Register v0.1----------------\n" +
                            "| 1. Create Year                           |\n" +
                            "| 2. Create Register                       |\n" +
                            "| 3. Add Students                          |\n" +
                            "| 4. Edit Register                         |\n" +
                            "| 5. Delete Year                           |\n" +
                            "| 6. Delete Register                       |\n" +
                            "| 7. Quit                                  |\n" +
                            "--------------------2016--------------------\n" );

            int selection = ReadConsole.nextInt();

            //language=RegExp

            switch ( selection ) {
                case 1:
                    menuYear();
                    break;
                case 2:
                    menuRegister();
                    break;
                case 3:
                    WriteToFile.setRecords();
                    break;
                case 4:


                    break;
                case 5:


                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println( "Invalid selection." );
                    break;

            }
        }
    }


    private static void menuYear() {
        while ( true ){
            Print.print(
                    "---------------Register v0.1----------------\n" +
                            "| 1. Create Year                           |\n" +
                            "| 2. Delete Year                           |\n" +
                            "| 3. Edit Year                             |\n" +
                            "| 4. Quit                                  |\n" +
                            "--------------------2016--------------------\n" );

            int selection = ReadConsole.nextInt();


            switch ( selection ) {
                case 1:
                    CreateFile.createYear();
                    break;
                case 2:
                    DeleteFile.deleteYear();
                    break;
                case 3:
                    RenameFile.renameYear();
                    break;
                case 4:
                    menu();


                    break;
                default:
                    System.out.println( "Invalid selection." );
                    break;

            }
        }
    }

    private static void menuRegister() {
        while ( true ){
            Print.print(
                    "---------------Register v0.1----------------\n" +
                            "| 1. Create Register                |\n" +
                            "| 2. Delete Register                |\n" +
                            "| 3. Edit Register                  |\n" +
                            "| 4. Quit                           |\n" +
                            "--------------------2016--------------------\n" );

            int selection = ReadConsole.nextInt();


            switch ( selection ) {
                case 1:
                    CreateFile.createRegister();
                    break;
                case 2:
                    DeleteFile.deleteRegister();
                    break;
                case 3:
                    RenameFile.renameRegister();
                    break;
                case 4:
                    menu();


                    break;
                default:
                    System.out.println( "Invalid selection." );
                    break;

            }
        }
    }


}
