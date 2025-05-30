# JavaShell

A minimal command-line shell implemented in Java. It supports basic built-in commands and demonstrates core concepts like REPL loops, command parsing, and interaction with system environment variables.

## Features

- **REPL Loop**: Continuously reads user input, evaluates it, and prints the output.
- **Built-in Commands**:
  - `echo [text]` – Prints the provided text.
  - `exit` – Exits the shell.
  - `type [command]` – Checks if a command is built-in or available in the system's `PATH`.
- **PATH Search**: The `type` command looks for executables in the system’s `PATH`.

## How It Works

- Uses a `HashMap` to store built-in commands and their handlers.
- Reads user input line-by-line.
- For `type`, it scans through directories listed in the system's `PATH` to determine if the command exists.

## Requirements

- Java 8 or higher
- Tested on Windows (VS Code)

## Usage

1. **Compile**:
   ```bash
   javac Shell.java
   ```

2. **Run**:
   ```bash
   java Shell
   ```

3. **Example Commands**:
   ```shell
   > echo Hello, World!
   Hello, World!

   > type echo
   echo is a shell builtin

   > type notepad
   notepad is /C/Windows/System32/notepad.exe
   ```

## TODO (Coming Soon)

- Add support for external command execution.
- Implement piping and redirection.
- Enhance cross-platform compatibility.

## License

This project is open-source and free to use for educational purposes.
