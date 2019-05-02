# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Improved ROS message filters"
AUTHOR = "Timo Röhling <timo.roehling@fkie.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_BPN = "fkie_message_filters"

ROS_BUILD_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fkie-release/message_filters-release/archive/release/melodic/fkie_message_filters/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a7842733a0f8af5b3f85fbeb692b8384"
SRC_URI[sha256sum] = "938b5bff6f2fb9ec9e2fe36b383f0b81828c5147f0870cda2650b2cc863e2652"
S = "${WORKDIR}/message_filters-release-release-melodic-fkie_message_filters-1.0.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fkie-message-filters/fkie-message-filters_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fkie-message-filters/fkie-message-filters_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fkie-message-filters/fkie-message-filters-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fkie-message-filters/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fkie-message-filters/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
