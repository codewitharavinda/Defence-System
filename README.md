# Defence System

Status: Under construction

A Java-based defence system project containing controller, view and observer components. This repository is a work-in-progress and currently under construction.

## Project Structure
- `build.xml` — Ant build script
- `src/` — Java source files
  - `controller/` — controller classes (e.g., `ControlRoom.java`)
  - `defence/` — defence-related classes (e.g., `Demo.java`)
  - `image/`, `obs/`, `view/` — supporting packages and UI classes (e.g., `MainController.java`, `Helicopter.java`, `Tank.java`, `Submarine.java`)
- `build/` — build output (compiled classes)

## Requirements
- Java (JDK 8+ recommended)
- Apache Ant (for building)

## Build
Build the project using Ant from the repository root:

```powershell
ant
```

This will compile sources into `build/classes` according to the included `build.xml`.

## Run
You can run the application from your IDE or from the command line after building. One of the main entry points is `view.MainController` (package path follows the `src/` folder layout).

Run the main class from the compiled classes directory, for example:

```powershell
java -cp build/classes view.MainController
```

If the project produces a jar via the Ant build, follow the Ant output for the jar path and run:

```powershell
java -jar path\to\your-built.jar
```

## Status
- This project is under active development. Many features are incomplete and the code may change frequently.

## Contributing
- If you'd like to contribute, please open issues or pull requests.
- Keep changes small and focused; include a description of what you're changing and why.

## License
This project is licensed under the MIT License — see the `LICENSE` file for details.

---

If you'd like, I can also:
- add a `CONTRIBUTING.md` with contribution guidelines
- add an example Ant target to create a runnable jar
- set the exact main class in `build.xml` (if you tell me which one to use)
