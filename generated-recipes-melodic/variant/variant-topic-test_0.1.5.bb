# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Variant topic tools testing suites."
AUTHOR = "Ralf Kaestner <ralf.kaestner@gmail.com>"
ROS_AUTHOR = "Ralf Kaestner"
HOMEPAGE = "http://github.com/ethz-asl/ros-topic-variant"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=146ba316845cfe6058c8baebd902a726"

ROS_CN = "variant"
ROS_BPN = "variant_topic_test"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    roscpp \
    std-msgs \
    variant-msgs \
    variant-topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    roscpp \
    std-msgs \
    variant-msgs \
    variant-topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    roscpp \
    std-msgs \
    variant-msgs \
    variant-topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/anybotics/variant-release/archive/release/melodic/variant_topic_test/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1a02dbbfa341a14ff18569e7ecff735e"
SRC_URI[sha256sum] = "bfb1f587202ae563d3c7c967de21660efdd00723675a8e16ae0b9592fc7d5142"
S = "${WORKDIR}/variant-release-release-melodic-variant_topic_test-0.1.5-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('variant', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('variant', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/variant/variant_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/variant/variant-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/variant/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/variant/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
