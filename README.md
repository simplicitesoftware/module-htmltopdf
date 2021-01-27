<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`HTMLToPDFTests` module definition
==================================

HTML to PDF tests
-----------------

These are HTML to PDF publication examples
using the [OpenHTMLToPDF lib](https://github.com/danfickle/openhtmltopdf).

> **Note**: this modules requires Simplicité **5.2+**

`HtpTestObject` business object definition
------------------------------------------

Test object

### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `htpHtpoCode`                                                | regexp(100)                              | yes*     | yes       |          | -                                                                                |
| `htpHtpoLabel`                                               | char(255)                                | yes      | yes       |          | -                                                                                |
| `htpHtpoDescription`                                         | html(1000000)                            |          | yes       |          | -                                                                                |

