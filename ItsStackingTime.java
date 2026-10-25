public class ItsStackingTime{
public static void main(String[] args){

        StackClass<Integer> intStack = new StackClass<Integer>(50);
        StackClass<Integer> tempStack = new StackClass<Integer>(50);


//STACK 1
//define and fill stack yip
StackClass<Integer> yip = new StackClass<Integer>(50);
for(int i=1;i<=50;i++){
   yip.push(i);
}
//print stack yip
System.out.println("Yip: ");
for(int i=1;i<=50;i++){
   System.out.print(yip.peek() + " ");
   yip.pop();
}
System.out.println();


//STACK 2
//define and fill stack yippee
StackClass<Integer> yippee = new StackClass<Integer>(48);
for(int i=1;i<=48;i++){
   yippee.push(i+5);
}

//print stack yippee
System.out.println("Yippee: ");
for(int i=1;i<=48;i++){
   System.out.print(yippee.peek() + " ");
   yippee.pop();
}
System.out.println();


//STACK 3
//define and fill stack yippers
StackClass<Integer> yippers = new StackClass<Integer>(50);
for(int i=1;i<=50;i++){
   yippers.push(i);
}

//print stack yippers
System.out.println("Yippers: ");
for(int i=1;i<=50;i++){
   System.out.print(yippers.peek() + " ");
   yippers.pop();
}
System.out.println();


//COMPARE STACKS

//Compare yip with yippee
if(yip.equalStack(yippee)==true){
System.out.println("These 2 stacks are the same :D");
} else{
   System.out.println("These 2 stacks are not the same :(");
}
//Compare yip with yippers
if(yip.equalStack(yippers)==true){
System.out.println("These 2 stacks are the same :D");
} else{
   System.out.println("These 2 stacks are not the same :(");
}



}
}
