package com.ludus;

//*******************************************************************************************
//*                         AsciiLogos.java                                                 *
//*     It is an enum containing the ascii logos shown in                                   *
//*     the startup of the game.                                                            *
//*                                                                                         *
//*     source : https://www.patorjk.com/software/taag/#p=testall&f=Wet%20Letter&t=ludus    *
//*                                                                                         *
//********************************************************************************************


import java.util.Random;

public enum AsciiLogos{


    a3D_DIAGONAL("""
  ,--,                                                      
,--.'|                      ,---,                           
|  | :            ,--,    ,---.'|         ,--,              
:  : '          ,'_ /|    |   | :       ,'_ /|   .--.--.    
|  ' |     .--. |  | :    |   | |  .--. |  | :  /  /    '   
'  | |   ,'_ /| :  . |  ,--.__| |,'_ /| :  . | |  :  /`./   
|  | :   |  ' | |  . . /   ,'   ||  ' | |  . . |  :  ;_     
'  : |__ |  | ' |  | |.   '  /  ||  | ' |  | |  \\  \\    `.  
|  | '.'|:  | : ;  ; |'   ; |:  |:  | : ;  ; |   `----.   \\ 
;  :    ;'  :  `--'   \\   | '/  ''  :  `--'   \\ /  /`--'  / 
|  ,   / :  ,      .-./   :    :|:  ,      .-./'--'.     /  
 ---`-'   `--`----'    \\   \\  /   `--`----'      `--'---'   
                        `----'                              """),

    ALPHA("""
           _____            _____                    _____                    _____                    _____          
         /\\    \\          /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\         
        /::\\____\\        /::\\____\\                /::\\    \\                /::\\____\\                /::\\    \\        
       /:::/    /       /:::/    /               /::::\\    \\              /:::/    /               /::::\\    \\       
      /:::/    /       /:::/    /               /::::::\\    \\            /:::/    /               /::::::\\    \\      
     /:::/    /       /:::/    /               /:::/\\:::\\    \\          /:::/    /               /:::/\\:::\\    \\     
    /:::/    /       /:::/    /               /:::/  \\:::\\    \\        /:::/    /               /:::/__\\:::\\    \\    
   /:::/    /       /:::/    /               /:::/    \\:::\\    \\      /:::/    /                \\:::\\   \\:::\\    \\   
  /:::/    /       /:::/    /      _____    /:::/    / \\:::\\    \\    /:::/    /      _____    ___\\:::\\   \\:::\\    \\  
 /:::/    /       /:::/____/      /\\    \\  /:::/    /   \\:::\\ ___\\  /:::/____/      /\\    \\  /\\   \\:::\\   \\:::\\    \\ 
/:::/____/       |:::|    /      /::\\____\\/:::/____/     \\:::|    ||:::|    /      /::\\____\\/::\\   \\:::\\   \\:::\\____\\
\\:::\\    \\       |:::|____\\     /:::/    /\\:::\\    \\     /:::|____||:::|____\\     /:::/    /\\:::\\   \\:::\\   \\::/    /
 \\:::\\    \\       \\:::\\    \\   /:::/    /  \\:::\\    \\   /:::/    /  \\:::\\    \\   /:::/    /  \\:::\\   \\:::\\   \\/____/ 
  \\:::\\    \\       \\:::\\    \\ /:::/    /    \\:::\\    \\ /:::/    /    \\:::\\    \\ /:::/    /    \\:::\\   \\:::\\    \\     
   \\:::\\    \\       \\:::\\    /:::/    /      \\:::\\    /:::/    /      \\:::\\    /:::/    /      \\:::\\   \\:::\\____\\    
    \\:::\\    \\       \\:::\\__/:::/    /        \\:::\\  /:::/    /        \\:::\\__/:::/    /        \\:::\\  /:::/    /    
     \\:::\\    \\       \\::::::::/    /          \\:::\\/:::/    /          \\::::::::/    /          \\:::\\/:::/    /     
      \\:::\\    \\       \\::::::/    /            \\::::::/    /            \\::::::/    /            \\::::::/    /      
       \\:::\\____\\       \\::::/    /              \\::::/    /              \\::::/    /              \\::::/    /       
        \\::/    /        \\::/____/                \\::/____/                \\::/____/                \\::/    /        
         \\/____/          ~~                       ~~                       ~~                       \\/____/         
"""),
    acrobatic("""
  o                        o                          
 <|>                      <|>                         
 / \\                      < \\                         
 \\o/   o       o     o__ __o/   o       o       __o__ 
  |   <|>     <|>   /v     |   <|>     <|>     />  \\  
 / \\  < >     < >  />     / \\  < >     < >     \\o     
 \\o/   |       |   \\      \\o/   |       |       v\\    
  |    o       o    o      |    o       o        <\\   
 / \\   <\\__ __/>    <\\__  / \\   <\\__ __/>   _\\o__</   
            """),
    ansiShadow("""
            
██╗     ██╗   ██╗██████╗ ██╗   ██╗███████╗
██║     ██║   ██║██╔══██╗██║   ██║██╔════╝
██║     ██║   ██║██║  ██║██║   ██║███████╗
██║     ██║   ██║██║  ██║██║   ██║╚════██║
███████╗╚██████╔╝██████╔╝╚██████╔╝███████║
╚══════╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝
                                          


            
            """);

    private final String logo;
    AsciiLogos(String logo){
        this.logo = logo;
    }
    public String getVal() {
        return  logo;
    }
    public String getRand(){
        return  com.ludus.AsciiLogos.values()[new Random().nextInt(com.ludus.AsciiLogos.values().length)].toString();
    }
}