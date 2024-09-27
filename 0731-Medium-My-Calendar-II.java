class MyCalendarTwo {
  private List<int[]> bookings;
  private List<int[]> overlaps;
  public MyCalendarTwo() {
    bookings = new ArrayList<>();
    overlaps = new ArrayList<>();
  }
  
  public boolean book(int start, int end) {
    for (int[] ov : overlaps) {
      if (start < ov[1] && end > ov[0])
        return false;
    }

    for (int[] bk : bookings) {
      if (start < bk[1] && end > bk[0])
        overlaps.add(new int[]{Math.max(start, bk[0]) , Math.min(end, bk[1])});
    }

    bookings.add(new int[]{start, end});

    return true;
  }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */