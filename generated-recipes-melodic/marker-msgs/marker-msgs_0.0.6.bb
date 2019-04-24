# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The marker_msgs package contains messages usable to setup a marker/fiducial system.      The package distinguishes between two types of messages.      First messages to describe the properties of a marker/fiducial detection system and the detected markers.      Secondly messages used to represent a map of markers/features with covariances as it would be produced by a SLAM system or published by a map server for self-localization."
AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
ROS_AUTHOR = "Markus Bader"
HOMEPAGE = "http://wiki.ros.org/marker_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marker_msgs"
ROS_BPN = "marker_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tuw-robotics/marker_msgs-release/archive/release/melodic/marker_msgs/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5c8017c975d7b17fd3ad8feb0f4ee47c"
SRC_URI[sha256sum] = "97c6b32ffed3602939b7decce5e38a880e7e64a3d1dd22217512ddf2779e48c5"
S = "${WORKDIR}/marker_msgs-release-release-melodic-marker_msgs-0.0.6-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('marker-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('marker-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marker-msgs/marker-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marker-msgs/marker-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marker-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marker-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
