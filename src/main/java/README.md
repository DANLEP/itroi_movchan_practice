`Content-type: application/soap+xml; charset=utf-8`

getBook

    <?xml version="1.0" encoding="utf-8"?>
    <S:Envelope xmlns:S="http://www.w3.org/2003/05/soap-envelope" xmlns:web="http://service/" xmlns:mod="http://model/">
    <S:Header/>
    <S:Body>
    <web:getBooks/>
    </S:Body>
    </S:Envelope>

getBooks

    <?xml version="1.0" encoding="utf-8"?>
    <S:Envelope xmlns:S="http://www.w3.org/2003/05/soap-envelope" xmlns:web="http://service/" xmlns:mod="http://model/">
    <S:Header/>
    <S:Body>
    <web:getBooks/>
    </S:Body>
    </S:Envelope>

getBooksByName

    <?xml version="1.0" encoding="utf-8"?>
    <S:Envelope xmlns:S="http://www.w3.org/2003/05/soap-envelope" xmlns:web="http://service/" xmlns:mod="http://model/">
    <S:Header/>
    <S:Body>
    <web:getBooksByName>
    <bookName>Book Title2</bookName>
    </web:getBooksByName>
    </S:Body>
    </S:Envelope>

addBook

    <?xml version="1.0" encoding="utf-8"?>
    <S:Envelope xmlns:S="http://www.w3.org/2003/05/soap-envelope" xmlns:web="http://service/" xmlns:mod="http://model">
    <S:Header/>
    <S:Body>
    <web:addBook>
    <mod:book>
    <id>1</id>
    <name>Book Title</name>
    </mod:book>
    </web:addBook>
    </S:Body>
    </S:Envelope>

removeBook

    <?xml version="1.0" encoding="utf-8"?>
    <S:Envelope xmlns:S="http://www.w3.org/2003/05/soap-envelope" xmlns:web="http://service/" xmlns:mod="http://model">
    <S:Header/>
    <S:Body>
    <web:removeBook>
    <id>1</id>
    </web:removeBook>
    </S:Body>
    </S:Envelope>

updateBook

    <?xml version="1.0" encoding="utf-8"?>
    <S:Envelope xmlns:S="http://www.w3.org/2003/05/soap-envelope" xmlns:web="http://service/" xmlns:mod="http://model">
    <S:Header/>
    <S:Body>
    <web:updateBook>
    <mod:book>
    <id>1</id>
    <name>Update Book Title</name>
    </mod:book>
    </web:updateBook>
    </S:Body>
    </S:Envelope>