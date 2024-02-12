Is just a simple library for hotel management to
extend my portfolio. Idk if u`ll use it.

<h2 align="left"> Room creation: </h2>
<code>IRoom room = new Room.Builder("name", "id")
      .setPrice(20) // default 1
      .setBedsNumber(2) // default 1
      .setConsumer(Class instanceOf IConsumer) // default empty
      .build();
</code>

<h4 align="left"> Created rooms are automatically registered in the room manager </h4>

<h3 align="left"> Getter for rooms: </h3>
<code> HotelBooking.getRoomManager().method(); </code>

<h3 align="left"> Creating Room with your own variables: </h3>
<code>public class YourClass extends AbstractRoom</code> ||
<code>public class YourClass implements IHotel</code>

<h3 align="left"> Creating new Interface for extended room: </h3>
<code>public interface YourInterface extends IHotel</code>

<h2 align="left"> Consumer creation: </h2>
<code>IConsumer consumer = new Consumer.Builder("name", "phoneNumber")
      .setBirthdayDate(2000 year, 2 month, 2 day) // default empty
      .setConsumerInfo("I dont want to be annoyed after 10 pm") // default empty
      .build();
</code>

<h3 align="left"> Creating Consumer with your own variables: </h3>
<code>public class YourClass extends AbstractConsumer</code> ||
<code>public class YourClass implements IConsumer</code>

<h3 align="left"> Creating new Interface for advanced consumer: </h3>
<code>public interface YourInterface extends IConsumer</code>
