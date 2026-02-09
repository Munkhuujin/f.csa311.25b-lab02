Rectangle.java, Circle.java, Square.java классууд дээр өгөгдлүүдийг private болгож, зөвхөн constructor-оор дамжуулж утга авдаг болгосон.
Shape.java класс дээр бүх дүрсүүд талбайгаа олж чаддаг байх ёстой тул getArea() методыг зарлаж өгсөн.
Renderer.java нь зөвхөн Rectangle-ийг биш, ямар ч Shape-ийг зурдаг болох ёстой.
Main.java дээр өмнө нь зөвхөн Rectangle-ийг импортолдог байсан бол одоо shape, circle. rectangle классуудыг тус тусад нь импортлон оруулж ирсэн
Rectangle rectangle = new Rectangle(2, 3); гэж зарлахын оронд Shape shape = new Rectangle (2, 3); гэж интерфэйс төрлөөр зарласан ба ингэснээр main класс зөвхөн нэг төрлийн дүрсээс хамааралгүй болж, ямар ч shape-тэй харьцах боломжтой болсон. 