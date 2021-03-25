# Guess The Number

Guess The Number game is a game where you guess a number which the computer generates at random (Between 0 to 100). You win if you guessed the number correctly.
If you enter a value higher than the guessed the number then the computer will tell you to lower your guess and if you enter a lower value
the computer will ask you to increase your guessed number. The less number of guesses you take to find the original number the better it is.

## How to Execute the file via shell/terminal

You can use the command line tools provided by the JDK to execute this file by writing the following lines shown below in your shell/terminal

```bash
javac Main.java
```

```bash
java Main
```

Note that for executing a Java file via shell/terminal you must first add the path of your JDK's bin folder in the environment variable named PATH.

## Usage

```bash

Guess a number between 0 to 100
Enter your guess here (Enter 101 to quit and 102 for help): 56

You entered too low! Higher the number

Enter your guess here (Enter 101 to quit and 102 for help): 67

You entered too low! Higher the number

Enter your guess here (Enter 101 to quit and 102 for help): 78

You entered too low! Higher the number

Enter your guess here (Enter 101 to quit and 102 for help): 85

You entered too low! Higher the number

Enter your guess here (Enter 101 to quit and 102 for help): 94

You entered too high! Lower the number

Enter your guess here (Enter 101 to quit and 102 for help): 90

You entered too low! Higher the number

Enter your guess here (Enter 101 to quit and 102 for help): 92

You entered too high! Lower the number

Enter your guess here (Enter 101 to quit and 102 for help): 91

You guessed it correct!
Number of guesses taken: 8

```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)