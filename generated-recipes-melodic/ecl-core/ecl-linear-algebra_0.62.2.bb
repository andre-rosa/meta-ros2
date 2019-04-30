# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecl frontend to a linear matrix package (currently eigen)."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_linear_algebra"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-converters \
    ecl-eigen \
    ecl-exceptions \
    ecl-formatters \
    ecl-license \
    ecl-math \
    sophus \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-build \
    ecl-converters \
    ecl-eigen \
    ecl-exceptions \
    ecl-formatters \
    ecl-license \
    ecl-math \
    sophus \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-build \
    ecl-converters \
    ecl-eigen \
    ecl-exceptions \
    ecl-formatters \
    ecl-license \
    ecl-math \
    sophus \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_linear_algebra/0.62.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5ca9fb53c301117217e829d28b6adb8a"
SRC_URI[sha256sum] = "5e9b99a6c02c0546ffdd155726bb735897f8591739850b9614143d6719e756e6"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_linear_algebra-0.62.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
