DESCRIPTION = "Apache logging framework for C++ library"
SECTION = "libs"
DEPENDS = "apr apr-util expat gdbm"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
HOMEPAGE = "http://logging.apache.org/log4cxx/"

# Get same source that was built for Ubuntu 18.04
SRC_URI = "https://salsa.debian.org/debian/log4cxx/-/archive/debian/${PV}/log4cxx-debian-${PV}.tar.gz"
SRC_URI[md5sum] = "7b582842f9eec5eb467c197c53fec96d"
SRC_URI[sha256sum] = "d9e41530b381cfa908cb402e869675bac34e1ecb366eb67946f17327b56f7672"

S = "${WORKDIR}/${BPN}-debian-${PV}"

inherit autotools-brokensep pkgconfig

BBCLASSEXTEND += "native"
