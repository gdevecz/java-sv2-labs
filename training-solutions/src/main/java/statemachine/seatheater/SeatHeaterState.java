package statemachine.seatheater;

public enum SeatHeaterState {

    THREE {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.TWO;
        }
    }, TWO {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.ONE;
        }
    }, ONE {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.ZERO;
        }
    }, ZERO {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.THREE;
        }
    };

    abstract SeatHeaterState next();
}

