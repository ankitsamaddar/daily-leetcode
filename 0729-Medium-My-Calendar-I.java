class MyCalendar {

    private List<int[]> calendar;
    public MyCalendar() {
      calendar = new ArrayList<>();        
    }
    
    public boolean book(int start, int end) {
      for (int[] ev : calendar) {
        if (Math.max(ev[0], start) < Math.min(ev[1], end))
          return false;
      }  

      calendar.add(new int[]{start, end});

      return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */