# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "AprilTag message definitions"
AUTHOR = "Christian Rauch <Rauch.Christian@gmx.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BPN = "apriltag_msgs"

ROS_BUILD_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/christianrauch/apriltag2_node-release/archive/release/crystal/apriltag_msgs/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "74bfc586e7770f6a7c107fb940a8b190"
SRC_URI[sha256sum] = "af7792e34c22e34c7cf69608d103c3d27cb182bb5741a3848fb21d4eb59cc028"
S = "${WORKDIR}/apriltag2_node-release-release-crystal-apriltag_msgs-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/apriltag2-node/apriltag2-node_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/apriltag2-node/apriltag2-node_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/apriltag2-node/apriltag2-node-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/apriltag2-node/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/apriltag2-node/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
