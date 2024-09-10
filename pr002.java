class pr002 {
	public static void main(String args[]) {
		int i, I;
//simvolniy tip dannih
System.out.print("primeri ispolzovania simvolnogo tipa\n");
char ch;
ch = 'd';
System.out.println("znachenie ch: " + ch);
ch++;
System.out.println("novoe znachenie ch: " + ch);
ch = 97;
System.out.println("znachenie ch s kodom 97:" + ch);
I = (int)ch;
System.out.println("Kod ch: " + I);
ch ='A';
for (i=0; i<63; i++) {
	I = (int)ch;
	System.out.print("kod simvola "+ ch + ":" + I + " \n ");
	ch++;
}
//logicheskiy tip dannih
System.out.println("primeri ispolzovania logicheskogo tipa\n");
boolean bool;
bool = false;
System.out.println("znachenie bool: " + bool);
bool = true;
System.out.println("znachenie bool: " + bool);
if(bool) 
	System.out.println("vivodim stroku, esli \"bool\" true");
if(!bool) 
	System.out.println("vivodim stroku, esli inversia \"bool\" true");
bool = (ch=='я');
if(bool)
	System.out.println("simvol ch raven \"я\"");

}
}

