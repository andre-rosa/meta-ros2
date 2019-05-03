# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A collection of tools for making a variety of generic ROS-related tasks easier."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/wu_ros_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "wu_ros_tools"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    easy-markers \
    joy-listener \
    kalman-filter \
    rosbaglive \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    easy-markers \
    joy-listener \
    kalman-filter \
    rosbaglive \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/melodic/wu_ros_tools/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "14a1702ba12ea6f323e6b73585b8cdd3"
SRC_URI[sha256sum] = "c27fe7753efad044328dfe5dc67e04deb7ea2a9d69b54b1fe34bdcbdc82d7335"
S = "${WORKDIR}/wu_ros_tools-release-melodic-wu_ros_tools-0.2.4-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('wu-ros-tools', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wu-ros-tools/wu-ros-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wu-ros-tools/wu-ros-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wu-ros-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wu-ros-tools/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
