"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TaskManager = void 0;
const Task_1 = require("../models/Task");
class TaskManager {
    constructor() {
        this.tasks = [];
    }
    addTask(title, description) {
        const task = new Task_1.Task(title, description);
        this.tasks.push(task);
        console.log(`Task added: ${title}`);
    }
    getTasks() {
        return this.tasks;
    }
    markTaskComplete(title) {
        const task = this.tasks.find(task => task.title === title);
        if (task) {
            task.markAsComplete();
            console.log(`Task marked as complete: ${title}`);
        }
        else {
            console.error("Task not found");
        }
    }
}
exports.TaskManager = TaskManager;
