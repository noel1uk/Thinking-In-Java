class CalcVelocity {

    static float calculate(float distance, float time) {
        float speed = distance/time;
        return speed;
    }
}

class CalcVelocityTest {

    public static void main(String[] args) {
        float distance = 2.0f;
        float time = 1.1f;
        float velocity = CalcVelocity.calculate(distance, time);
        System.out.println(velocity);
    }
}