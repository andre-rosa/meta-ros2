# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ROS messages for MRPT classes and objects"
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
HOMEPAGE = "http://wiki.ros.org/mrpt_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_msgs"
ROS_BPN = "mrpt_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_msgs-release/archive/release/melodic/mrpt_msgs/0.1.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fcc25ae883e1be9ea366cb6310261991"
SRC_URI[sha256sum] = "baf8fd73e1c316f837c29fcaea20d6cb5cb84d4083813944b09005de9297de1d"
S = "${WORKDIR}/mrpt_msgs-release-release-melodic-mrpt_msgs-0.1.22-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mrpt-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mrpt-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-msgs/mrpt-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-msgs/mrpt-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
