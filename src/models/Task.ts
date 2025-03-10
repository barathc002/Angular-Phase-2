export class Task {
    constructor(
        public title: string,
        public description: string,
        public completed: boolean = false
    ) {}

    markAsComplete(): void {
        this.completed = true;
    }
}