# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Control hardware functions of the PRBT manipulator like STO for Stop1 functionality."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/prbt_hardware_support"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "pilz_robots"
ROS_BPN = "prbt_hardware_support"

ROS_BUILD_DEPENDS = " \
    libmodbus-dev \
    message-filters \
    message-generation \
    roscpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    roscpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    roscpp \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cmake-modules \
    code-coverage \
    pilz-testutils \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_hardware_support/0.5.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c4a4aa7b940e5c012c96047f73f754fc"
SRC_URI[sha256sum] = "8833ee4869bd8c34bf8d4b9d76ec465235de9121403da7989ed73c31f648d5f0"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_hardware_support-0.5.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pilz-robots', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pilz-robots', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/pilz-robots_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/pilz-robots-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
