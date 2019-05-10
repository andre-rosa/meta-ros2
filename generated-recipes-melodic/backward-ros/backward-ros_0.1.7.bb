# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The backward_ros package is a ros wrapper of backward-cpp from https://github.com/bombela/backward-cpp"
AUTHOR = "Victor López <victor.lopez@pal-robotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "backward_ros"
ROS_BPN = "backward_ros"

ROS_BUILD_DEPENDS = " \
    elfutils \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    elfutils \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    elfutils \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pal-gbp/backward_ros-release/archive/release/melodic/backward_ros/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8b2d6ceb6bfca2d5c6734cbebc78bda5"
SRC_URI[sha256sum] = "3cec255db3ff1af9bfc80b31ca88a9be50f11d663d9213edf457b0a7ed7eb967"
S = "${WORKDIR}/backward_ros-release-release-melodic-backward_ros-0.1.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('backward-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('backward-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/backward-ros/backward-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/backward-ros/backward-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/backward-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/backward-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
