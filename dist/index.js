"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const TaskManager_1 = require("./services/TaskManager");
const taskManager = new TaskManager_1.TaskManager();
taskManager.addTask("Complete TypeScript Project", "Implement a task manager using TypeScript");
taskManager.addTask("Test Application", "Ensure all features work as expected");
console.log("All Tasks:", taskManager.getTasks());
taskManager.markTaskComplete("Complete TypeScript Project");
console.log("Updated Tasks:", taskManager.getTasks());
