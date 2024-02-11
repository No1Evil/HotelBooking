Is just a simple library for hotel management to
extend my portfolio. Idk if u`ll use it.

<h3 align="left"> Room creation: </h3>
<code>IRoom room = new Room.Builder("name", "id")
      .price("price")
      .isBusy("isRoomBusy")
      .bedsNumber("beds amount in room")
      .build();
</code>

<h4 align="left"> Created rooms are automatically registered in the room manager </h4>

<h3 align="left"> Getter for rooms: </h3>
<code> HotelBooking.getRoomManager().yourMethod(); </code>

<h3 align="left"> Creating Room with your own variables: </h3>
<code>public class YourClass extends AbstractRoom</code>
<code>public class YourClass implements IHotel</code>

<h3 align="left"> Creating new Interface for extended room: </h3>
<code>public interface YourInterface extends IHotel</code>
