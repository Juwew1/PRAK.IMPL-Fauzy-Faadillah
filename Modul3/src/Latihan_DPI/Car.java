package Latihan_DPI;

    class Car {
        private EngineInterface engine;

        public Car(EngineInterface engine) {
            this.engine = engine;
        }

        void start(){
            this.engine.start();
        }
}
