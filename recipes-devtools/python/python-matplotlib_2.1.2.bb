DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication quality figures in a variety of hardcopy formats"
SECTION = "devel/python"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE/LICENSE;md5=afec61498aa5f0c45936687da9a53d74"

DEPENDS += "python-numpy freetype libpng python-dateutil python-pytz"
RDEPENDS_${PN} = "python-core python-distutils python-numpy freetype libpng python-dateutil python-pytz"

SRC_URI = "https://github.com/matplotlib/matplotlib/archive/v${PV}.tar.gz \
           file://fix_setupext.patch \
"
SRC_URI[md5sum] = "38e86246695821c758a30d04e3c15145"
SRC_URI[sha256sum] = "613d79282a0a8ba88cfc52dbcf1b08ab070dae395c3d313d141ccc3f87e3c9fa"
S = "${WORKDIR}/matplotlib-${PV}"
EXTRA_OECONF = "--disable-docs"

inherit setuptools pkgconfig

