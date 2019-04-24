# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Extension of locomotor that implements move_base's functionality."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_navigation"
ROS_BPN = "locomove_base"

ROS_BUILD_DEPENDS = " \
    locomotor \
    move-base-msgs \
    nav-2d-utils \
    nav-core \
    nav-core-adapter \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    locomotor \
    move-base-msgs \
    nav-2d-utils \
    nav-core \
    nav-core-adapter \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    locomotor \
    move-base-msgs \
    nav-2d-utils \
    nav-core \
    nav-core-adapter \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/locomove_base/0.2.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "57c104a2d0bd3fbbd9e755dc7e9aede7"
SRC_URI[sha256sum] = "f8eb11d52a5e4b23ba8563021f1273b28f5be9f690335ab490ae50ca34f23b30"
S = "${WORKDIR}/robot_navigation-release-release-melodic-locomove_base-0.2.5-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('robot-navigation', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('robot-navigation', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-navigation/robot-navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-navigation/robot-navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-navigation/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
