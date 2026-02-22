# Prison Escape 🔓
![Java](https://img.shields.io/badge/Java-11+-orange.svg)
![License](https://img.shields.io/badge/license-Educational-blue.svg)
A text-based adventure game where you must escape from an underground prison.

## 🌟 Highlights
- **Single-slot inventory system** - Strategic item management required
- **Puzzle-based progression** - Use items to unlock new areas
- **Command Pattern architecture** - Clean, extensible design
- **Data-driven content** - All game data loaded from JSON

## ℹ️ Overview
Prison Escape is a text adventure game created as a semester project for Introduction to Programming. You wake up in a prison cell with one goal: reach the surface! Navigate through 8 interconnected rooms, collect items, solve puzzles, and find your way out of the underground facility.

## ✍️ Author
Created by **Ondřej Tomášek** ([@ondrat-png](https://github.com/ondrat-png))

## ⬇️ Installation

### Requirements
- Java JDK 11 or higher

### Setup Instructions
The game requires no special installation. All game data and necessary libraries (like Gson) are bundled directly inside the executable `.jar` file.

**Run the game:**
Open your terminal (or command prompt) and run the following command using the path to the downloaded file:

```bash
java -jar /path/to/your/file/unikovka.jar
```
**Alternative:** Open the project in **IntelliJ IDEA** and run `Main.java` directly.

## 🚀 Usage
Example gameplay:
```text
>>> prohledat
Našel jsi: Kus drátu
>>> vezmi Kus drátu
Sebral jsi: Kus drátu
>>> jdi Chodba
Temná chodba, slouží jako křižovatka
```
### Available Commands
| Command | Description |
|---------|-------------|
| `jdi [room]` | Move to adjacent room |
| `prohledat` | Search current room |
| `vezmi [item]` | Pick up item |
| `zahodit` | Drop current item |
| `inventar` | Show inventory |
| `otevrit [object]` | Use item on object (safe/cabinet) |
| `mluv` | Talk to NPC |
| `napoveda` | Get hint |
| `mapa` | Display map |
| `pomoc` | List all commands |
| `konec` | Exit game |
## 🎮 Game Mechanics
- **Inventory**: 1-slot capacity (carry only one item at a time)
- **8 Rooms**: From prison cell to surface
- **5 Items**: Wire piece, Crowbar, Fuse, Safe code, ID card
- **Locked Rooms**: Require specific items to unlock
- **NPC**: Robot provides hints in the office
## 🏗️ Architecture
```
src/
├── Commands/       Command pattern implementation
├── Charakters/     Player and NPC classes
├── Items/          Items and inventory system
├── Locations/      Room management
└── Core/           Game engine
res/
├── gameData.json   Game data (rooms, items, NPCs)
├── Help.txt        Help text
└── mapa.txt        ASCII map
```
### Design Patterns
- **Command Pattern** - Each game command is a separate class implementing the `Command` interface
- **Data-Driven Design** - All content loaded from JSON, enabling modifications without code changes
## 💭 Feedback and Contributing
This is a completed academic project. Feel free to:
- Open an **Issue** if you find bugs
- Fork the repository and experiment
- Use it as a learning resource
## 📝 License
Created for educational purposes.
---
**Good luck escaping! 🔑**
