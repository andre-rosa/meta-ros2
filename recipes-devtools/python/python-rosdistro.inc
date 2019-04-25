DESCRIPTION = "ROS package library"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=988919d688133096537549f9afebf425"
SRCNAME = "rosdistro"

SRC_URI = "https://github.com/ros-infrastructure/rosdistro/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "cfa1acb3be6ebc30a146601238d34920"
SRC_URI[sha256sum] = "f0d5a3a671d5718d531f865640aa77270f951959525ac97720889c89510ac827"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "${PYTHON_PN}-pyyaml"

BBCLASSEXTEND = "native"
