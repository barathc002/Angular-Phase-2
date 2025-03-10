import { Task } from "../models/Task";

export class TaskManager {
    private tasks: Task[] = [];

    addTask(title: string, description: string): void {
        const task = new Task(title, description);
        this.tasks.push(task);
        console.log(`Task added: ${title}`);
    }

    getTasks(): Task[] {
        return this.tasks;
    }

    markTaskComplete(title: string): void {
        const task = this.tasks.find(task => task.title === title);
        if (task) {
            task.markAsComplete();
            console.log(`Task marked as complete: ${title}`);
        } else {
            console.error("Task not found");
        }
    }
}