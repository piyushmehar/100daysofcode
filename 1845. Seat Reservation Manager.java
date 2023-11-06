class SeatManager {
private PriorityQueue<Integer> availableSeats;

    public SeatManager(int n) {
        availableSeats = new PriorityQueue<>();
        for (int seat = 1; seat <= n; seat++) {
            availableSeats.offer(seat);
        }
    }

    public int reserve() {
        if (!availableSeats.isEmpty()) {
            int reservedSeat = availableSeats.poll();
            return reservedSeat;
        } else {
            return -1; // No available seats.
        }
    }

    public void unreserve(int seatNumber) {
        availableSeats.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
