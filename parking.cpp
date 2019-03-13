#include<iostream>
using namespace std;
int main(){
	int choice,vehical,two=0,four=0,exit,twop=0,fourp=0;//variables 

	do{
	

	cout<<"\n******************************"<<"\n";
	cout<<"press 1 to entry"<<"\n"<<"press 2 to exit OF vehicle"<<"\n"<<"press 3 to see remaining vehicle"<<"\n"<<"press 4 to see total entry"<<"\n";
	cout<<"*******************************\n";
	//message which will be shown to user
cin>>choice;
	switch (choice)//switch starts
		{
			case 1://for the entry of vehicle
				{
					cout<<"press 1 for two wheeler and 2 for four wheeler\n\n\n";
					cin>>vehical;
					if(vehical==1)
					{
					two++;
					twop++;
					}
					else 
					{
						four++;
						fourp++;
					}
				}
	
				
					break;
				case 2://for the exit of the vehicle
					{
						cout<<"press 1 for two wheeler exit and 2 for four wheeler\n\n\n";
						cin>>exit;
						if(exit==1)two--;
						else four--;
					}
					break;
					case 3://to get the present status of the parking
						cout<<"presently there are ----------\n"<<two<<"two wheeler\n"<<"and-----\n "<<four<<"\tfour wheelar in our parking\n\n\n";
						break;
						case 4://to calculate all the amount and entry of the day
						{
							cout<<"today total "<<twop<<" two wheelar and    \n"<<four<<" four wheelar vehicale ented in the parking";
							cout<<"\n turn over of the day is-\n\n"<<(50*twop)+(100*fourp);
						}
		}
		}
			while(choice!=0);return 0;
}
