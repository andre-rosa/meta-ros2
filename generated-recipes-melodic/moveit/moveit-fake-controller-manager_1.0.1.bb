# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "Michael Görner <me@v4hn.de>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "moveit_fake_controller_manager"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_fake_controller_manager/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1fd9d5606e4ac5b8195365fd23759707"
SRC_URI[sha256sum] = "feaa120207501e6224b2ce7340cadecc2bd54533ab516ffea3423d635a58a612"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_fake_controller_manager-1.0.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('moveit', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/moveit_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/moveit-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
