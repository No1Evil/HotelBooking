Is just a simple library for hotel management.
I made it to extend my portfolio. Idk if u`ll use it.

<h3 align="left"> Room creation: </h3>
<code>IRoom room = new Room.Builder("name", "id")
      .price("price")
      .isBusy("isRoomBusy")
      .bedsNumber("beds amount in room")
      .build();
</code>

<h4> Created rooms are automatically registered in the room manager </h4>

(Created rooms are automatically registered in room manager)

<h3> Getter for rooms: </h3>
<code> HotelBooking.getRoomManager().yourMethod(); </code>
