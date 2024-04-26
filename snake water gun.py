import random

def user_choice():
    user=input(" Enter your choice between 'snake','water','gun':").lower()
    while user not in ['snake','water','gun']:
        print("Invalid choice! Please enter choices between snake,water and gun:")
        user=input(" Enter your choice between 'snake','water','gun':").lower()
    return user  

def computer_choice():
    return random.choice(['snake','water','gun'])
    


def determine_result(user_choice,computer_choice):
    if (computer_choice==user_choice):
        return "TIE"

    elif ((computer_choice=="snake")and(user_choice=="water")or
         (computer_choice=="water") and(user_choice=="gun")or
         (computer_choice=="gun")and (user_choice=="snake")
         ):
        return "computer wins the game"
    else:
        return"user wins the game


                             
def main():
    print("Welcome to 'Snake' ,'Water', 'Gun' game! ")
    
    while True:
        user=user_choice()
        
        computer=computer_choice()

        print(f"user choice:{user}")
        print(f"computer choice:{computer}")
        winner=determine_result(user,computer)
        print(winner)
        play_again=input("do you want to play agian(Yes or no):").lower()
        if play_again !="yes":
            break 
print("bye!")
       
if __name__=="__main__":
    main()






