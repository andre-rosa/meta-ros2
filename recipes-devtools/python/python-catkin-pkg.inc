DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
PYPI_PACKAGE = "catkin_pkg"

DEPENDS = "${PYTHON_PN}-pyparsing"

SRC_URI[md5sum] = "ab3adff656c9921adc74cc043bc7cf1d"
SRC_URI[sha256sum] = "b67f9a395cddbd748f0a1539738ab5b9b2793a17f1f55f9fa016697bc676a59f"

inherit pypi

RDEPENDS_${PN} = "${PYTHON_PN}-unixadmin"
RDEPENDS_${PN}_class-native = ""

BBCLASSEXTEND = "native nativesdk"
