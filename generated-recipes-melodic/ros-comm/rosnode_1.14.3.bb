# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosnode is a command-line tool for displaying debug information     about ROS <a href="http://www.ros.org/wiki/Nodes">Nodes</a>,     including publications, subscriptions and connections. It also     contains an experimental library for retrieving node     information. This library is intended for internal use only."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/rosnode"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rosnode"

ROS_BUILD_DEPENDS = " \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosgraph \
    rostopic \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosgraph \
    rostopic \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosnode/1.14.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3dfc9b98493ab444198fe09f1c470600"
SRC_URI[sha256sum] = "9766e0e61bb3e82cab7763af6c0881d2c7cd95cd8a14bcb0538da50124be4d80"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosnode-1.14.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros-comm/ros-comm_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros-comm/ros-comm_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/ros-comm-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
