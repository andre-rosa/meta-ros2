# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-package for the universal variant library."
AUTHOR = "Ralf Kaestner <ralf.kaestner@gmail.com>"
HOMEPAGE = "http://github.com/ethz-asl/ros-topic-variant"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=146ba316845cfe6058c8baebd902a726"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    variant-msgs \
    variant-topic-test \
    variant-topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/anybotics/variant-release/archive/release/melodic/variant/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "741b69bc45307f13758ab5dd97cfde15"
SRC_URI[sha256sum] = "411a327e244ea82a5a6b105a6e81aad03422b96a22ee148d57ba2abaf96aa2cb"
S = "${WORKDIR}/variant-release-release-melodic-variant-0.1.5-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/variant/variant_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/variant/variant_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variant/variant-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variant/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variant/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
