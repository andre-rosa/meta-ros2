DESCRIPTION = "rosdep package manager abstraction tool for ROS"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86a73ab7b555900fd6b51429658aca4c"
SRCNAME = "rosdep"

SRC_URI = "https://github.com/ros-infrastructure/rosdep/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "8d7ccf8d0796b12cd9e77cfbaed08c23"
SRC_URI[sha256sum] = "2e45156fed7b3ffb633dcd3c2bec65305d9e820112ba4d5d81309cc7410530a0"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "${PYTHON_PN}-catkin-pkg ${PYTHON_PN}-rospkg ${PYTHON_PN}-pyyaml ${PYTHON_PN}-netclient ${PYTHON_PN}-rosdistro"

BBCLASSEXTEND += "native"
