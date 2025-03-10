"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Task = void 0;
class Task {
    constructor(title, description, completed = false) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }
    markAsComplete() {
        this.completed = true;
    }
}
exports.Task = Task;
