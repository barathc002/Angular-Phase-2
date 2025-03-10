import { TaskManager } from "./services/TaskManager";

const taskManager = new TaskManager();

taskManager.addTask("Complete TypeScript Project", "Implement a task manager using TypeScript");
taskManager.addTask("Test Application", "Ensure all features work as expected");

console.log("All Tasks:", taskManager.getTasks());

taskManager.markTaskComplete("Complete TypeScript Project");
console.log("Updated Tasks:", taskManager.getTasks());