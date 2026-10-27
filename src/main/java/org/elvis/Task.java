package org.elvis;

public class Task {
        private long id;
        private String title;
        private String description;
        private boolean completed;


        public void setTitle(String title){
            this.title = title;
        }

        public void setDescription(String description){
            this.description = description;
        }


        public void

        Task(long id, String title, String description){
            this.id = id;
            this.title = title;
            this.description = description;

        }

}
